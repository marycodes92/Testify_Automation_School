describe('Login Module', ()=>{
  beforeEach(()=>{
    cy.visit('https://www.saucedemo.com');
  })
  it('login with valid details', () => {
    cy.get('#user-name').type('standard_user');
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();
    cy.get('.shopping_cart_link').should('be.visible');
  })

  it('login with invalid details', () => {
    cy.get('#user-name').type('standard');
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();
    cy.get('[data-test=error]').should('be.visible').and('have.text', 'Epic sadface: Username and password do not match any user in this service')
  })
})