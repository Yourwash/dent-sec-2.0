export interface AppointmentToCreate {
  date: string | null | undefined;
  time: string | null | undefined;
  operationId: number | null | undefined;
  clientId: number | null | undefined;
  dentistIdList: number[] | null | undefined;
  helperIdList: number[] | null | undefined;
}
