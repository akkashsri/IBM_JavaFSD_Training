export class Customer {
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
    constructor(private _firstName: string, private _lastName: string) {
    }

    get firstName(): string {
       return this._firstName;
    }

    set firstName(value: string) {
        this._firstName = value;
    }
}

let myCustomer = new Customer("Martin", "Dixon");

myCustomer.firstName = "Greg";
console.log(myCustomer.firstName);

// myCustomer.firstName = "Martin";
// myCustomer.lastName = "Dixon";
//
// console.log(myCustomer.firstName);
// console.log(myCustomer.lastName);

// myCustomer._firstName = "susan";
// console.log(myCustomer._firstName);