import dayjs from 'dayjs/esm';
import { IUser } from 'app/entities/user/user.model';
import { ICategory } from 'app/entities/category/category.model';
import { PriorityEnum } from 'app/entities/enumerations/priority-enum.model';
import { StatusEnum } from 'app/entities/enumerations/status-enum.model';

export interface ITask {
  id: number;
  title?: string | null;
  description?: string | null;
  priority?: keyof typeof PriorityEnum | null;
  status?: keyof typeof StatusEnum | null;
  dueDate?: dayjs.Dayjs | null;
  createdAt?: dayjs.Dayjs | null;
  assignee?: Pick<IUser, 'id' | 'login'> | null;
  category?: Pick<ICategory, 'id' | 'name'> | null;
}

export type NewTask = Omit<ITask, 'id'> & { id: null };
