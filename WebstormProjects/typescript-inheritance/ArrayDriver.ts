import {Circle} from "./Circle";
import {Shape} from "./Shape";
import {Rectangle} from "./Rectangle";

let myShape =  new Shape(10, 15);
let myCircle = new Circle(5, 10, 20);
let myRectangle = new Rectangle(0, 0, 3, 7);

let theShapes: Shape[] = [myShape, myCircle, myRectangle];

for (let tempShape of theShapes) {
    console.log(tempShape.getInfo());
}