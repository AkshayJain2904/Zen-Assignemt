import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
 products:Product[]=[
  {
    productId: "1001",
    name: "LED TV",
    brand: "Sony",
    price: 45000
},
{
    productId: "1002",
    name: "Laptop",
    brand: "HP",
    price: 363
},
{
    productId: "1003",
    name: "Mobile",
    brand: "Samsung",
    price: 42300
},
{
    productId: "1004",
    name: "UCB",
    brand: "gfd",
    price: 43322
}
 ];
  constructor(private productService:ProductService) { 

  }

  ngOnInit() {
    //this.products.push(new Product())
    this.showProducts();
  }
  addProduct(product:Product){
    let p:Product=new Product()
    p.productId=product.productId;
    p.name=product.name
    p.brand=product.brand
    p.price=product.price
    this.products.push(p);
  }

  showProducts(){
    this.productService.getAllProducts().subscribe(data => this.products  = data);
  }

}
