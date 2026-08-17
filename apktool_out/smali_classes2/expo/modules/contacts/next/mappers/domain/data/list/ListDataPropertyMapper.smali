.class public interface abstract Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TDomain::",
        "Lexpo/modules/contacts/next/domain/model/Extractable$Data;",
        "TExistingDto::",
        "Lexpo/modules/contacts/next/records/ExistingRecord;",
        "TNewDto::",
        "Lexpo/modules/contacts/next/records/NewRecord;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u0004*\u0008\u0008\u0002\u0010\u0005*\u00020\u00062\u00020\u0007J\u0015\u0010\u0008\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00022\u0006\u0010\u0011\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;",
        "TDomain",
        "Lexpo/modules/contacts/next/domain/model/Extractable$Data;",
        "TExistingDto",
        "Lexpo/modules/contacts/next/records/ExistingRecord;",
        "TNewDto",
        "Lexpo/modules/contacts/next/records/NewRecord;",
        "",
        "toDto",
        "model",
        "(Lexpo/modules/contacts/next/domain/model/Extractable$Data;)Lexpo/modules/contacts/next/records/ExistingRecord;",
        "toUpdatable",
        "Lexpo/modules/contacts/next/domain/model/Updatable$Data;",
        "newValue",
        "(Lexpo/modules/contacts/next/records/ExistingRecord;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;",
        "toAppendable",
        "Lexpo/modules/contacts/next/domain/model/Appendable;",
        "rawContactId",
        "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;",
        "toAppendable-MYK5hZQ",
        "(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;",
        "expo-contacts_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTNewDto;",
            "Ljava/lang/String;",
            ")",
            "Lexpo/modules/contacts/next/domain/model/Appendable;"
        }
    .end annotation
.end method

.method public abstract toDto(Lexpo/modules/contacts/next/domain/model/Extractable$Data;)Lexpo/modules/contacts/next/records/ExistingRecord;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTDomain;)TTExistingDto;"
        }
    .end annotation
.end method

.method public abstract toUpdatable(Lexpo/modules/contacts/next/records/ExistingRecord;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTExistingDto;)",
            "Lexpo/modules/contacts/next/domain/model/Updatable$Data;"
        }
    .end annotation
.end method
