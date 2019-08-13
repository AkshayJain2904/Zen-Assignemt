import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
customers:Customer[]=[
  {
    name:"Akshay",
    birthDay:new Date(1997,4,12)
  },
  {
    name:"Ram",
    birthDay:new Date(1998,4,28)
  },
  {
    name:"Sham",
    birthDay:new Date(1999,11,5)
  }
]
  constructor() { }

  ngOnInit() {
    // this.customers.push(new Customer())
  }
  addCustomer(customer:Customer){
    let c:Customer=new Customer()
    c.name=customer.name
    c.birthDay=customer.birthDay
    this.customers.push(c)
  }

}
