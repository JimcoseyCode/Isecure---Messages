.class public final Lexpo/modules/contacts/next/domain/model/relationship/operations/AppendableRelation;
.super Lexpo/modules/contacts/next/domain/model/relationship/RelationModel;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/domain/model/Appendable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/relationship/operations/AppendableRelation;",
        "Lexpo/modules/contacts/next/domain/model/relationship/RelationModel;",
        "Lexpo/modules/contacts/next/domain/model/Appendable;",
        "rawContactId",
        "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;",
        "name",
        "",
        "label",
        "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getRawContactId-WW_a-ig",
        "()Ljava/lang/String;",
        "Ljava/lang/String;",
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


# instance fields
.field private final rawContactId:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;)V
    .locals 1

    const-string v0, "rawContactId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p2, p3}, Lexpo/modules/contacts/next/domain/model/relationship/RelationModel;-><init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;)V

    .line 3
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/model/relationship/operations/AppendableRelation;->rawContactId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/contacts/next/domain/model/relationship/operations/AppendableRelation;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;)V

    return-void
.end method


# virtual methods
.method public getRawContactId-WW_a-ig()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/relationship/operations/AppendableRelation;->rawContactId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public toAppendOperation()Landroid/content/ContentProviderOperation;
    .locals 1

    .line 1
    invoke-static {p0}, Lexpo/modules/contacts/next/domain/model/Appendable$DefaultImpls;->toAppendOperation(Lexpo/modules/contacts/next/domain/model/Appendable;)Landroid/content/ContentProviderOperation;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
