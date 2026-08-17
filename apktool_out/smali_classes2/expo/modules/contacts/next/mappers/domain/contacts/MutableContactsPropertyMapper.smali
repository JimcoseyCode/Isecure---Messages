.class public interface abstract Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TDomain::",
        "Lexpo/modules/contacts/next/domain/model/Extractable;",
        "TDto:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper<",
        "TTDomain;TTDto;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0004\u0008\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00028\u0001H&\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;",
        "TDomain",
        "Lexpo/modules/contacts/next/domain/model/Extractable;",
        "TDto",
        "Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;",
        "toUpdatable",
        "Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;",
        "contactId",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactId;",
        "newValue",
        "toUpdatable-D2TBaGg",
        "(Ljava/lang/String;Ljava/lang/Object;)Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;",
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
.method public abstract toUpdatable-D2TBaGg(Ljava/lang/String;Ljava/lang/Object;)Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TTDto;)",
            "Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;"
        }
    .end annotation
.end method
