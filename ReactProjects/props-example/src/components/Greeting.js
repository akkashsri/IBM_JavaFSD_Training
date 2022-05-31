import Person from "./Person";
function Greeting()
{
    const name='John Doe'
    return(
        <div>
            <Person name={name}/>
        </div>
    );
}
export default Greeting;