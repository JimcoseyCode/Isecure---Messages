.class public final enum LR2/b$a;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum g:LR2/b$a;

.field public static final enum h:LR2/b$a;

.field private static final synthetic i:[LR2/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR2/b$a;

    .line 2
    .line 3
    const-string v1, "BLEND_WITH_PREVIOUS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LR2/b$a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LR2/b$a;->g:LR2/b$a;

    .line 10
    .line 11
    new-instance v1, LR2/b$a;

    .line 12
    .line 13
    const-string v2, "NO_BLEND"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, LR2/b$a;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, LR2/b$a;->h:LR2/b$a;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [LR2/b$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, LR2/b$a;->i:[LR2/b$a;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LR2/b$a;
    .locals 1

    .line 1
    const-class v0, LR2/b$a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LR2/b$a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LR2/b$a;
    .locals 1

    .line 1
    sget-object v0, LR2/b$a;->i:[LR2/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, [LR2/b$a;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LR2/b$a;

    .line 8
    .line 9
    return-object v0
.end method
