.class LJ8/u;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final g:LJ8/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ8/u;

    .line 2
    .line 3
    invoke-direct {v0}, LJ8/u;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ8/u;->g:LJ8/u;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LI7/i;

    .line 2
    .line 3
    invoke-static {p1}, LJ8/v$a;->e(LI7/i;)LC8/S;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
