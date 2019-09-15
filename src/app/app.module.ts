import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmpTableComponent } from './emp-table/emp-table.component';
import { EmpFormComponent } from './emp-form/emp-form.component';

@NgModule({
  declarations: [
    AppComponent,
    EmpTableComponent,
    EmpFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
