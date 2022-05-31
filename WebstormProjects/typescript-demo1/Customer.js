"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Customer = void 0;
var Customer = /** @class */ (function () {
    // private firstName: string;
    // private lastName: string;
    //
    // constructor(theFirst: string, theLast: string) {
    //     this.firstName = theFirst;
    //     this.lastName = theLast;
    // }
    // constructor(private firstName: string, private lastName) {
    // }
    // public getFirstName(): string {
    //     return this.firstName
    // }
    //
    // public setFirstName(theFirst: string): void {
    //     this.firstName = theFirst;
    // }
    function Customer(_firstName, _lastName) {
        this._firstName = _firstName;
        this._lastName = _lastName;
    }
    Object.defineProperty(Customer.prototype, "firstName", {
        get: function () {
            return this._firstName;
        },
        set: function (value) {
            this._firstName = value;
        },
        enumerable: false,
        configurable: true
    });
    return Customer;
}());
exports.Customer = Customer;
var myCustomer = new Customer("Martin", "Dixon");
myCustomer.firstName = "Greg";
console.log(myCustomer.firstName);
// myCustomer.firstName = "Martin";
// myCustomer.lastName = "Dixon";
//
// console.log(myCustomer.firstName);
// console.log(myCustomer.lastName);
// myCustomer._firstName = "susan";
// console.log(myCustomer._firstName);
