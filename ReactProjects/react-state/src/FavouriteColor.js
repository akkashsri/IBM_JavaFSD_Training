import {useState} from "react";
function FavoriteColor() {
    const [color, setColor] = useState("red");
    const [source,setSource]=useState("1")
    return (
        <>
            <h1>My favorite color is {color}!</h1>
            <h1>{source}</h1>
            <button
                type="button"
                onClick={() => setSource("2")}
            >Change Source</button>
            <button
                type="button"
                onClick={() => setColor("red")}
            >Red</button>
            <button
                type="button"
                onClick={() => setColor("pink")}
            >Pink</button>
            <button
                type="button"
                onClick={() => setColor("green")}
            >Green</button>
        </>
    );
}
export default FavoriteColor;