.class public final Lexpo/modules/contacts/next/domain/model/headers/starred/PatchStarred;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/headers/starred/PatchStarred;",
        "Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;",
        "contactId",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactId;",
        "starred",
        "Lexpo/modules/kotlin/types/ValueOrUndefined;",
        "",
        "<init>",
        "(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getContactId-S9XCBSM",
        "()Ljava/lang/String;",
        "Ljava/lang/String;",
        "contentValues",
        "Landroid/content/ContentValues;",
        "getContentValues",
        "()Landroid/content/ContentValues;",
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
.field private final contactId:Ljava/lang/String;

.field private final contentValues:Landroid/content/ContentValues;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/types/ValueOrUndefined<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "contactId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "starred"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/model/headers/starred/PatchStarred;->contactId:Ljava/lang/String;

    .line 4
    new-instance p1, Landroid/content/ContentValues;

    invoke-direct {p1}, Landroid/content/ContentValues;-><init>()V

    .line 5
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result v1

    if-nez v1, :cond_0

    .line 6
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 7
    :cond_0
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/model/headers/starred/PatchStarred;->contentValues:Landroid/content/ContentValues;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/contacts/next/domain/model/headers/starred/PatchStarred;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;)V

    return-void
.end method


# virtual methods
.method public getContactId-S9XCBSM()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/headers/starred/PatchStarred;->contactId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContentValues()Landroid/content/ContentValues;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/headers/starred/PatchStarred;->contentValues:Landroid/content/ContentValues;

    .line 2
    .line 3
    return-object v0
.end method

.method public toUpdateOperation()Landroid/content/ContentProviderOperation;
    .locals 1

    .line 1
    invoke-static {p0}, Lexpo/modules/contacts/next/domain/model/Updatable$Contacts$DefaultImpls;->toUpdateOperation(Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;)Landroid/content/ContentProviderOperation;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
