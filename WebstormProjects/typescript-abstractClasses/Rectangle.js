"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Rectangle = void 0;
const Shape_1 = require("./Shape");
class Rectangle extends Shape_1.Shape {
    constructor(theX, theY, _width, _length) {
        super(theX, theY);
        this._width = _width;
        this._length = _length;
    }
    getInfo() {
        return super.getInfo() + `, width = ${this._width}, length = ${this._length}`;
    }
    calculateArea() {
        return `Rectangle Area = ${this._length * this._width}`;
    }
}
exports.Rectangle = Rectangle;
