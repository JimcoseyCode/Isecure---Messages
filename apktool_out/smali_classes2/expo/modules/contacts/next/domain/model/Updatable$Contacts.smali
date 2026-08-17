.class public interface abstract Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/domain/model/Updatable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/contacts/next/domain/model/Updatable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Contacts"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/contacts/next/domain/model/Updatable$Contacts$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0008"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;",
        "Lexpo/modules/contacts/next/domain/model/Updatable;",
        "contactId",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactId;",
        "getContactId-S9XCBSM",
        "()Ljava/lang/String;",
        "toUpdateOperation",
        "Landroid/content/ContentProviderOperation;",
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
.method public abstract getContactId-S9XCBSM()Ljava/lang/String;
.end method

.method public abstract toUpdateOperation()Landroid/content/ContentProviderOperation;
.end method
