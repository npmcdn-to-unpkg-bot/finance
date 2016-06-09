import {Parsing} from "../parsing/parsing";

export class Company {
    id: number;
    name: string;
    description: string;
    parsingList: Array<Parsing>;
}
