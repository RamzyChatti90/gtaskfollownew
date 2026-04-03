import dayjs from 'dayjs/esm';

import { ITask, NewTask } from './task.model';

export const sampleWithRequiredData: ITask = {
  id: 9181,
  title: 'or consequently',
  priority: 'HIGH',
  status: 'BLOCKED',
};

export const sampleWithPartialData: ITask = {
  id: 15218,
  title: 'gah worth',
  description: 'conjecture',
  priority: 'LOW',
  status: 'TODO',
};

export const sampleWithFullData: ITask = {
  id: 13396,
  title: 'where wherever',
  description: 'but than',
  priority: 'URGENT',
  status: 'TODO',
  dueDate: dayjs('2026-04-02'),
  createdAt: dayjs('2026-04-02T16:09'),
};

export const sampleWithNewData: NewTask = {
  title: 'expostulate',
  priority: 'MEDIUM',
  status: 'DONE',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
