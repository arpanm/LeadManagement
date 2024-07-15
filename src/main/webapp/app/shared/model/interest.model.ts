import dayjs from 'dayjs';

export interface IInterest {
  id?: number;
  category?: string;
  brand?: string | null;
  articleId?: string | null;
  orderId?: string | null;
  isPurchased?: boolean | null;
  createdAt?: dayjs.Dayjs | null;
  createdBy?: string | null;
  updatedAt?: dayjs.Dayjs | null;
  updatedBy?: string | null;
}

export const defaultValue: Readonly<IInterest> = {
  isPurchased: false,
};
