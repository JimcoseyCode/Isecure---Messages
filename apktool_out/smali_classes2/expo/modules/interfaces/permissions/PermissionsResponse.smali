.class public final Lexpo/modules/interfaces/permissions/PermissionsResponse;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/interfaces/permissions/PermissionsResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lexpo/modules/interfaces/permissions/PermissionsResponse;",
        "",
        "status",
        "Lexpo/modules/interfaces/permissions/PermissionsStatus;",
        "canAskAgain",
        "",
        "<init>",
        "(Lexpo/modules/interfaces/permissions/PermissionsStatus;Z)V",
        "getStatus",
        "()Lexpo/modules/interfaces/permissions/PermissionsStatus;",
        "getCanAskAgain",
        "()Z",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "Companion",
        "expo-modules-core_release"
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
.field public static final CAN_ASK_AGAIN_KEY:Ljava/lang/String; = "canAskAgain"

.field public static final Companion:Lexpo/modules/interfaces/permissions/PermissionsResponse$Companion;

.field public static final EXPIRES_KEY:Ljava/lang/String; = "expires"

.field public static final GRANTED_KEY:Ljava/lang/String; = "granted"

.field public static final PERMISSION_EXPIRES_NEVER:Ljava/lang/String; = "never"

.field public static final SCOPE_ALWAYS:Ljava/lang/String; = "always"

.field public static final SCOPE_IN_USE:Ljava/lang/String; = "whenInUse"

.field public static final SCOPE_KEY:Ljava/lang/String; = "scope"

.field public static final SCOPE_NONE:Ljava/lang/String; = "none"

.field public static final STATUS_KEY:Ljava/lang/String; = "status"


# instance fields
.field private final canAskAgain:Z

.field private final status:Lexpo/modules/interfaces/permissions/PermissionsStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/interfaces/permissions/PermissionsResponse$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/interfaces/permissions/PermissionsResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->Companion:Lexpo/modules/interfaces/permissions/PermissionsResponse$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lexpo/modules/interfaces/permissions/PermissionsStatus;Z)V
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->status:Lexpo/modules/interfaces/permissions/PermissionsStatus;

    .line 3
    iput-boolean p2, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->canAskAgain:Z

    return-void
.end method

.method public synthetic constructor <init>(Lexpo/modules/interfaces/permissions/PermissionsStatus;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lexpo/modules/interfaces/permissions/PermissionsResponse;-><init>(Lexpo/modules/interfaces/permissions/PermissionsStatus;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lexpo/modules/interfaces/permissions/PermissionsResponse;Lexpo/modules/interfaces/permissions/PermissionsStatus;ZILjava/lang/Object;)Lexpo/modules/interfaces/permissions/PermissionsResponse;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->status:Lexpo/modules/interfaces/permissions/PermissionsStatus;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-boolean p2, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->canAskAgain:Z

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/interfaces/permissions/PermissionsResponse;->copy(Lexpo/modules/interfaces/permissions/PermissionsStatus;Z)Lexpo/modules/interfaces/permissions/PermissionsResponse;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final component1()Lexpo/modules/interfaces/permissions/PermissionsStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->status:Lexpo/modules/interfaces/permissions/PermissionsStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->canAskAgain:Z

    .line 2
    .line 3
    return v0
.end method

.method public final copy(Lexpo/modules/interfaces/permissions/PermissionsStatus;Z)Lexpo/modules/interfaces/permissions/PermissionsResponse;
    .locals 1

    .line 1
    const-string v0, "status"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/interfaces/permissions/PermissionsResponse;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lexpo/modules/interfaces/permissions/PermissionsResponse;-><init>(Lexpo/modules/interfaces/permissions/PermissionsStatus;Z)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lexpo/modules/interfaces/permissions/PermissionsResponse;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lexpo/modules/interfaces/permissions/PermissionsResponse;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->status:Lexpo/modules/interfaces/permissions/PermissionsStatus;

    .line 14
    .line 15
    iget-object v3, p1, Lexpo/modules/interfaces/permissions/PermissionsResponse;->status:Lexpo/modules/interfaces/permissions/PermissionsStatus;

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-boolean v1, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->canAskAgain:Z

    .line 21
    .line 22
    iget-boolean p1, p1, Lexpo/modules/interfaces/permissions/PermissionsResponse;->canAskAgain:Z

    .line 23
    .line 24
    if-eq v1, p1, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    return v0
.end method

.method public final getCanAskAgain()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->canAskAgain:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getStatus()Lexpo/modules/interfaces/permissions/PermissionsStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->status:Lexpo/modules/interfaces/permissions/PermissionsStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->status:Lexpo/modules/interfaces/permissions/PermissionsStatus;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-boolean v1, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->canAskAgain:Z

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->status:Lexpo/modules/interfaces/permissions/PermissionsStatus;

    .line 2
    .line 3
    iget-boolean v1, p0, Lexpo/modules/interfaces/permissions/PermissionsResponse;->canAskAgain:Z

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "PermissionsResponse(status="

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, ", canAskAgain="

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, ")"

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method
