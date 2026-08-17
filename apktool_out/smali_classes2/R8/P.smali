.class public final enum LR8/P;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR8/P$a;
    }
.end annotation


# static fields
.field public static final enum g:LR8/P;

.field public static final enum h:LR8/P;

.field public static final enum i:LR8/P;

.field public static final enum j:LR8/P;

.field private static final synthetic k:[LR8/P;

.field private static final synthetic l:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LR8/P;

    .line 2
    .line 3
    const-string v1, "DEFAULT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LR8/P;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LR8/P;->g:LR8/P;

    .line 10
    .line 11
    new-instance v0, LR8/P;

    .line 12
    .line 13
    const-string v1, "LAZY"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LR8/P;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LR8/P;->h:LR8/P;

    .line 20
    .line 21
    new-instance v0, LR8/P;

    .line 22
    .line 23
    const-string v1, "ATOMIC"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LR8/P;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LR8/P;->i:LR8/P;

    .line 30
    .line 31
    new-instance v0, LR8/P;

    .line 32
    .line 33
    const-string v1, "UNDISPATCHED"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, LR8/P;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LR8/P;->j:LR8/P;

    .line 40
    .line 41
    invoke-static {}, LR8/P;->h()[LR8/P;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, LR8/P;->k:[LR8/P;

    .line 46
    .line 47
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, LR8/P;->l:Lkotlin/enums/EnumEntries;

    .line 52
    .line 53
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

.method private static final synthetic h()[LR8/P;
    .locals 4

    .line 1
    sget-object v0, LR8/P;->g:LR8/P;

    .line 2
    .line 3
    sget-object v1, LR8/P;->h:LR8/P;

    .line 4
    .line 5
    sget-object v2, LR8/P;->i:LR8/P;

    .line 6
    .line 7
    sget-object v3, LR8/P;->j:LR8/P;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [LR8/P;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LR8/P;
    .locals 1

    .line 1
    const-class v0, LR8/P;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LR8/P;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LR8/P;
    .locals 1

    .line 1
    sget-object v0, LR8/P;->k:[LR8/P;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LR8/P;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final j(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ln7/f;)V
    .locals 2

    .line 1
    sget-object v0, LR8/P$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x4

    .line 19
    if-ne v0, p1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p1, Li7/m;

    .line 23
    .line 24
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1, p2, p3}, LX8/b;->c(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ln7/f;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    invoke-static {p1, p2, p3}, Ln7/h;->a(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ln7/f;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_3
    invoke-static {p1, p2, p3}, LX8/a;->b(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ln7/f;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final k()Z
    .locals 1

    .line 1
    sget-object v0, LR8/P;->h:LR8/P;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method
