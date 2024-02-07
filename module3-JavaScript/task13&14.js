/**
 * 
    Task
    Using object literal, write a JavaScript object, books.
    The book object should take the following properties
    title (string)
    description (string)
    numberOfPages (number)
    authour (string)
    reading (boolean)
 */

const books = {
    title: "Living in Bondage",
    description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ",
    numberOfPages: 50,
    author: "Chinua Achebe",
    reading: true,
    toggleReadingStatus: function(){
        books.reading = (books.reading === true) ? false : true
    }
}

books.toggleReadingStatus()
console.log(books)