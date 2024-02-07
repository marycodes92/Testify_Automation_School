/**
 * Task

    You now have more books in your library. You should manage them all in one place. Any idea how you can achieve that?... Arrays!
    Create a books array. 
    1. Each element of this array will be a book object. 
    2. Each book object will have the following properties
        title (string)
        description (string)
        numberOfPages (number)
        authour (string)
        reading (boolean)
    3. Use a for-loop to loop through the books array and log all books where the reading status is true to the console
 */

const books = [
    {
        title: "Living in Bondage",
        description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        numberOfPages: 50,
        author: "Chinua Achebe",
        reading: true,
    }, 
    {
        title: "The Psychology of Money",
        description: "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
        numberOfPages: 200,
        author: "Morgan Horsel",
        reading: false,
    }, 
    {
        title: "The Courage to Be Disliked",
        description: "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
        numberOfPages: 130,
        author: "Ichiro Kishimi",
        reading: true,
    }
]

for(let book = 0; book <= books.length; book++){
    if(books[book].reading === true ){
        console.log(books[book])
    } else{
        console.log("You're not reading any book yet");
    }
}