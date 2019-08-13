import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from './product';


@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) {
   }
   getAllProducts(){
      return this.http.get<Product[]>("http://localhost:8080/products");        //ajax call
   }
   addProduct(product:Product){
      return this.http.post("http://localhost:8080/products",product);
   }
   updateProduct(product:Product){
     return this.http.put("http://localhost:8080/products",product);
   }
   deleteProduct(){
      return this.http.delete("http://localhost:8080/products");
   }
}
