import {Company} from "../company/company";
import {ParsingData} from "../parsingData/parsingData";

export class Parsing {
    id: number;
    company: Company;
    date: Date;
    source: string;
    parsingDataList: Array<ParsingData>;
}
