import dayjs from 'dayjs';
import { IInterest } from 'app/shared/model/interest.model';

export interface ILead {
  id?: number;
  name?: string;
  phone?: number;
  createdAt?: dayjs.Dayjs | null;
  createdBy?: string | null;
  updatedAt?: dayjs.Dayjs | null;
  updatedBy?: string | null;
  interest?: IInterest | null;
}

export const defaultValue: Readonly<ILead> = {};
