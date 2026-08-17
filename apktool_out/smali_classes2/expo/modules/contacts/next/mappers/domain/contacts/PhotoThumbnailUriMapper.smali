.class public final Lexpo/modules/contacts/next/mappers/domain/contacts/PhotoThumbnailUriMapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper<",
        "Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/domain/contacts/PhotoThumbnailUriMapper;",
        "Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;",
        "Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;",
        "",
        "<init>",
        "()V",
        "toDto",
        "model",
        "toDto-PFa3EAE",
        "(Ljava/lang/String;)Ljava/lang/String;",
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
.field public static final INSTANCE:Lexpo/modules/contacts/next/mappers/domain/contacts/PhotoThumbnailUriMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/mappers/domain/contacts/PhotoThumbnailUriMapper;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/mappers/domain/contacts/PhotoThumbnailUriMapper;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/mappers/domain/contacts/PhotoThumbnailUriMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/contacts/PhotoThumbnailUriMapper;

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
    check-cast p1, Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;

    .line 2
    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;->unbox-impl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/mappers/domain/contacts/PhotoThumbnailUriMapper;->toDto-PFa3EAE(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public toDto-PFa3EAE(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    return-object p1
.end method
