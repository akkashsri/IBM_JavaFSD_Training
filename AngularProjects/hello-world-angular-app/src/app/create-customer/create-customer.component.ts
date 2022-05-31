import { Component, OnInit } from '@angular/core';
import {Customer} from "../customer";

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  formData: any = {};
  customer:Customer= new Customer('','','');
  constructor() { }

  ngOnInit(): void {
    console.log(this.customer)
  }

  register() {
    console.log(this.customer);
  }

}
