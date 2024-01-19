describe('Login Module', ()=>{
  it('login as a standard user', () => {
    cy.visit('https://www.saucedemo.com');
    cy.get('#user-name').type('standard_user');
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();
    cy.get('.shopping_cart_link').should('be.visible');
  })
})