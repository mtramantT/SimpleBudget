import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../Models/User';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  private static baseURL:string = "http://localhost:8080/users";
  private static options = {headers: new HttpHeaders().set('Content-Type', 'application/json')}
  constructor(private http:HttpClient) { }

  checkUsername(username:string){
    const url = AuthenticationService.baseURL + "/username" + username;
    this.http.get(url).subscribe(data => {
      return data.toString
    })
  }

  login(username:string, password:string){
    var user = new User(username, password);
    var url = "http://localhost:8080/users/login";
    return this.http.post<User>(url, JSON.stringify(user), AuthenticationService.options);
  }

  register(user:User){
    var url = AuthenticationService.baseURL + "/save"
    this.http.post<User>(url, JSON.stringify(user), AuthenticationService.options)
  }
  
  test(){
    this.http.get("http://localhost:8080/users/hello", AuthenticationService.options)
      .subscribe();
  }
}
