export class Shape {
    constructor(private _x: number, private _y: number) {
    }

    //get set accessors
    getInfo(): string {
        return `x = ${this._x}, y = ${this._y}`;
    }
}