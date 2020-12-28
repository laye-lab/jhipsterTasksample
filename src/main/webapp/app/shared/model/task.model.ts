import { Moment } from 'moment';

export interface ITask {
  id?: number;
  completed?: string;
  duedate?: Moment;
  name?: string;
}

export class Task implements ITask {
  constructor(public id?: number, public completed?: string, public duedate?: Moment, public name?: string) {}
}
