.class public final Lexpo/modules/contacts/next/mappers/domain/contacts/StarredMapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper<",
        "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/domain/contacts/StarredMapper;",
        "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;",
        "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;",
        "",
        "<init>",
        "()V",
        "toDto",
        "model",
        "toDto-RmBWN14",
        "(I)Ljava/lang/Boolean;",
        "toUpdatable",
        "Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;",
        "contactId",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactId;",
        "newValue",
        "toUpdatable-D2TBaGg",
        "(Ljava/lang/String;Z)Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;",
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


# static fields
.field public static final INSTANCE:Lexpo/modules/contacts/next/mappers/domain/contacts/StarredMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/mappers/domain/contacts/StarredMapper;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/mappers/domain/contacts/StarredMapper;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/mappers/domain/contacts/StarredMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/contacts/StarredMapper;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic toDto(Lexpo/modules/contacts/next/domain/model/Extractable;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;

    .line 2
    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;->unbox-impl()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/mappers/domain/contacts/StarredMapper;->toDto-RmBWN14(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public toDto-RmBWN14(I)Ljava/lang/Boolean;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public bridge synthetic toUpdatable-D2TBaGg(Ljava/lang/String;Ljava/lang/Object;)Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/contacts/StarredMapper;->toUpdatable-D2TBaGg(Ljava/lang/String;Z)Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;

    move-result-object p1

    return-object p1
.end method

.method public toUpdatable-D2TBaGg(Ljava/lang/String;Z)Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;
    .locals 2

    const-string v0, "contactId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;-><init>(Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
