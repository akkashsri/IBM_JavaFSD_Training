// import ReactDOM from "react-dom/client";
import React from "react";
import './App.css';
import Car from "./Car";
import Football from "./Football";
class App extends React.Component
{
  render() {
    return(
        <div>
          <Car price='12000'/>
            <Football></Football>
        </div>
    )
  }
}
export default App;