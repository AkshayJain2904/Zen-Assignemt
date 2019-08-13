import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { GreetingComponent } from './greeting/greeting.component';
import { ProductComponent } from './product/product.component';
import { CustomerComponent } from './customer/customer.component';
import { LogincomponentComponent } from './logincomponent/logincomponent.component';
import { ProductListComponent } from './product-list/product-list.component';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { OrderComponent } from './order/order.component';
import { CategoryComponent } from './category/category.component';
import { ProductMenuComponent } from './product-menu/product-menu.component';



const routes: Routes = [
  {
    path:'login',
    component:LogincomponentComponent
  },
  {
    path:'product',
    component:ProductMenuComponent
  },
  {
    path:'customer-list',
    component:CustomerListComponent
  },
  {
    path:'order',
    component:OrderComponent
  },
  {
    path:'category',
    component:CategoryComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
