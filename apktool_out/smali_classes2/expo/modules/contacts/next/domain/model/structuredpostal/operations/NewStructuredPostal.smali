.class public final Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/NewStructuredPostal;
.super Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/domain/model/Insertable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/NewStructuredPostal;",
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;",
        "Lexpo/modules/contacts/next/domain/model/Insertable;",
        "street",
        "",
        "city",
        "region",
        "postcode",
        "country",
        "label",
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;)V",
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


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;)V
    .locals 1

    .line 1
    const-string v0, "label"

    .line 2
    .line 3
    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct/range {p0 .. p6}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public toInsertOperation()Landroid/content/ContentProviderOperation;
    .locals 1

    .line 1
    invoke-static {p0}, Lexpo/modules/contacts/next/domain/model/Insertable$DefaultImpls;->toInsertOperation(Lexpo/modules/contacts/next/domain/model/Insertable;)Landroid/content/ContentProviderOperation;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
