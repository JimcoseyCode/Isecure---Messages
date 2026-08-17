.class LI7/a;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# static fields
.field public static final g:LI7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LI7/a;

    .line 2
    .line 3
    invoke-direct {v0}, LI7/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LI7/a;->g:LI7/a;

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
.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, LI7/b$a;->b()LI7/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
