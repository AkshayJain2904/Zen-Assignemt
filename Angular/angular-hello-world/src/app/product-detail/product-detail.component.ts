import { Component, OnInit, Input } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-product-detail',
  template: ` <h2>Product id is:- {{product.productId}}</h2>
  <h3>Product name is:-{{product.name}}</h3>
  <h2>Product brand is:- {{product.brand}}</h2>
  <h3>Product price is:- {{product.price}}</h3>
  `,
  styles: [`h2 {color:green}`,`h3 {color:aqua}`]
})
export class ProductDetailComponent implements OnInit {

  @Input()
  product:Product
  constructor() { }

  ngOnInit() {
  }

}
