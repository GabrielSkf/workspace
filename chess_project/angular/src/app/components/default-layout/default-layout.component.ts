import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Cell } from '../../models/cell';

@Component({
  selector: 'app-default-layout',
  imports: [CommonModule],
  templateUrl: './default-layout.component.html',
  styleUrl: './default-layout.component.scss'
})
export class DefaultLayoutComponent {
  board: Cell[][] = [];
  rows: number = 8;
  coluns: number = 8;
  

  ngOnInit() {
    this.generateBoard(this.rows, this.coluns);
    this.setInitialPieces();
  }

  generateBoard(rows: number, cols: number) {
  this.board = [];
  for (let y = 0; y < rows; y++) {
    const row: Cell[] = []; // 👈 Corrigido para Cell[]
    for (let x = 0; x < cols; x++) {
      const color = (x + y) % 2 === 0 ? 'white' : 'black';
      const cell: Cell = { color };
      row.push(cell);
    }
    this.board.push(row);
  }
}

  setInitialPieces() {
  this.board[0][this.coluns - 1].piece = 'black-po';
}

onPieceClick(cell: Cell, x: number, y: number) {
  console.log('Peça clicada:', cell, 'posição:', x, y);
  // aqui você pode controlar movimento, highlight, etc.
}

selectCell(cell: Cell) {
  // Desmarca todas as células
  this.board.flat().forEach(c => c.selected = false);

  // Marca a célula clicada
  cell.selected = true;
}



}
