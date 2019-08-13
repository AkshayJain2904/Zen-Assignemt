import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GreetingComponent } from './greeting/greeting.component';
import { LogincomponentComponent } from './logincomponent/logincomponent.component';
import { FootercomponentComponent } from './footercomponent/footercomponent.component';
import { from } from 'rxjs';
import { ProductComponent } from './product/product.component';
import { CustomerComponent } from './customer/customer.component';
import { ProductListComponent } from './product-list/product-list.component';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { CustomerDetailComponent } from './customer-detail/customer-detail.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { OrderComponent } from './order/order.component';
import { CategoryComponent } from './category/category.component';
import { ProductMenuComponent } from './product-menu/product-menu.component';
import { ProductModule } from './product/product.module';
import { HighlightDirective } from './highlight.directive';
import { HttpClientModule } from '@angular/common/http';
import { ProductService } from './product.service';

@NgModule({
  declarations: [
    AppComponent,
    GreetingComponent,
    LogincomponentComponent,
    FootercomponentComponent,
    ProductComponent,
    CustomerComponent,
    ProductListComponent,
    CustomerListComponent,
    CustomerDetailComponent,
    ProductDetailComponent,
    OrderComponent,
    CategoryComponent,
    ProductMenuComponent,
    HighlightDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ProductModule,
    HttpClientModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
