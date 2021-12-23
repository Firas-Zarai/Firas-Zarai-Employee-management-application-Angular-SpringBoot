import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {
  title = 'Gestion Employés';
  constructor(private authservice: AuthService, private router: Router) { }

  ngOnInit(): void {
  }

  logOut(){
    this.authservice.logOut();
    this.router.navigate(['/login'])
  }
}
