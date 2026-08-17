.class abstract enum LD8/z$a;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD8/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD8/z$a$a;,
        LD8/z$a$b;,
        LD8/z$a$c;,
        LD8/z$a$d;
    }
.end annotation


# static fields
.field public static final enum g:LD8/z$a;

.field public static final enum h:LD8/z$a;

.field public static final enum i:LD8/z$a;

.field public static final enum j:LD8/z$a;

.field private static final synthetic k:[LD8/z$a;

.field private static final synthetic l:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LD8/z$a$c;

    .line 2
    .line 3
    const-string v1, "START"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LD8/z$a$c;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LD8/z$a;->g:LD8/z$a;

    .line 10
    .line 11
    new-instance v0, LD8/z$a$a;

    .line 12
    .line 13
    const-string v1, "ACCEPT_NULL"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LD8/z$a$a;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LD8/z$a;->h:LD8/z$a;

    .line 20
    .line 21
    new-instance v0, LD8/z$a$d;

    .line 22
    .line 23
    const-string v1, "UNKNOWN"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LD8/z$a$d;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LD8/z$a;->i:LD8/z$a;

    .line 30
    .line 31
    new-instance v0, LD8/z$a$b;

    .line 32
    .line 33
    const-string v1, "NOT_NULL"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, LD8/z$a$b;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LD8/z$a;->j:LD8/z$a;

    .line 40
    .line 41
    invoke-static {}, LD8/z$a;->h()[LD8/z$a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, LD8/z$a;->k:[LD8/z$a;

    .line 46
    .line 47
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, LD8/z$a;->l:Lkotlin/enums/EnumEntries;

    .line 52
    .line 53
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LD8/z$a;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic h()[LD8/z$a;
    .locals 4

    .line 1
    sget-object v0, LD8/z$a;->g:LD8/z$a;

    .line 2
    .line 3
    sget-object v1, LD8/z$a;->h:LD8/z$a;

    .line 4
    .line 5
    sget-object v2, LD8/z$a;->i:LD8/z$a;

    .line 6
    .line 7
    sget-object v3, LD8/z$a;->j:LD8/z$a;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [LD8/z$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LD8/z$a;
    .locals 1

    .line 1
    const-class v0, LD8/z$a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LD8/z$a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LD8/z$a;
    .locals 1

    .line 1
    sget-object v0, LD8/z$a;->k:[LD8/z$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LD8/z$a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract j(LC8/M0;)LD8/z$a;
.end method

.method protected final k(LC8/M0;)LD8/z$a;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LC8/S;->L0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object p1, LD8/z$a;->h:LD8/z$a;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    instance-of v0, p1, LC8/y;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, LC8/y;

    .line 21
    .line 22
    invoke-virtual {v0}, LC8/y;->W0()LC8/d0;

    .line 23
    .line 24
    .line 25
    :cond_1
    sget-object v0, LD8/r;->a:LD8/r;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, LD8/r;->a(LC8/M0;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    sget-object p1, LD8/z$a;->j:LD8/z$a;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_2
    sget-object p1, LD8/z$a;->i:LD8/z$a;

    .line 37
    .line 38
    return-object p1
.end method
