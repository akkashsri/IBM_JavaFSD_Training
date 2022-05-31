// import ReactDOM from "react-dom/client";
import React from "react";
class Car extends React.Component {
    constructor() {
        super();
        this.state = {color: "red",name: 'Ford'};
        //this.state={name: 'Ford'}
    }
    render() {
        return <h2>I am a {this.state.color} Color {this.state.name} Car! {this.props.price}</h2>;
    }
}
export default Car;