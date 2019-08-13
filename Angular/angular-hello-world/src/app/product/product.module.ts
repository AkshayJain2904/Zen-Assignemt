import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { ProductComponent } from './product.component';
import { ProductListComponent } from '../product-list/product-list.component';

const routeProduct:Routes=[
  {
    path:'product/addProduct',
    component:ProductComponent
  },
  {
    path:'product/viewProduct',
    component:ProductListComponent
  }
];


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forChild(routeProduct)
  ],
  exports: [RouterModule]
})
export class ProductModule { }
