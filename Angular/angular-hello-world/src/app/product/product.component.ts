import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
product:Product
togg:boolean
show:string

@Output()
productEmitter=new EventEmitter<Product>()
  constructor(private productService:ProductService) { 
    this.product=new Product()
    this.togg=false
  }

  ngOnInit() {
  }
  add(){
    this.productEmitter.emit(this.product)
    this.productService.addProduct(this.product).subscribe();
  }
  toggle(){
    this.togg=!this.togg;
    this.show=this.togg?'Show this paragraph':'Do not Show this paragraph';
  }
  update(){
    this.productService.updateProduct(this.product).subscribe();
  }
  delete(){
    this.productService.deleteProduct().subscribe();
  }

}
