package com.db.tradestorage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "Trades")
public class Trade {

    @Id
    private String tradeId;

    private int version;

    private String counterPartyId;

    private String bookId;

    private LocalDate maturityDate;

    private LocalDate createdDate;

    private String expired;

    
    public Trade(String string, int i, String string2, String string3, LocalDate localDate, LocalDate localDate2, char c) {
		// TODO Auto-generated constructor stub
	}

	public Trade() {
		// TODO Auto-generated constructor stub
	}

	public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getCounterParty() {
        return counterPartyId;
    }

    public void setCounterParty(String counterParty) {
        this.counterPartyId = counterParty;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getExpiredFlag() {
        return expired;
    }

    public void setExpiredFlag(String expiredFlag) {
        this.expired = expiredFlag;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "tradeId='" + tradeId + '\'' +
                ", version=" + version +
                ", counterParty='" + counterPartyId + '\'' +
                ", bookId='" + bookId + '\'' +
                ", maturityDate=" + maturityDate +
                ", createdDate=" + createdDate +
                ", expiredFlag='" + expired + '\'' +
                '}';
    }
}
