import Car from "./Car";
function Garage(props) {
    return (
        <div>
            <h1>Garage Name: {props.name}</h1>
            <h1>Who lives in my garage?</h1>
            <Car brand="Ford" model="Eco Sports" />
        </div>
    );
}
export default Garage;