export interface AppointmentToCreate {
  date: string | null | undefined;
  time: string | null | undefined;
  operationId: string | null | undefined | number;
  clientId: string | null | undefined;
  dentistIdList: number[] | null | undefined;
  helperIdList: number[] | null | undefined;
}
