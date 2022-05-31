import { Component, OnInit } from '@angular/core';
import {Customer} from "../customer";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customerList: Customer[] = [
    new Customer('John', 'Doe', 'John@email.com'),
    new Customer('Marry', 'Public', 'Marry@email.com'),
    new Customer('Rahul', 'Dravid', 'Rahul@email.com')
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
