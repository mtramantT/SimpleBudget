import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AddReceiptComponent } from './components/add-receipt/add-receipt.component';


const routes: Routes = [
  {
    path:'home',
    component: HomeComponent
  },
  {
    path:'add_receipt',
    component: AddReceiptComponent
  },
  {
    path:'',
    component: HomeComponent
  },
    
  {
    path:'**',
    redirectTo: 'home',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
