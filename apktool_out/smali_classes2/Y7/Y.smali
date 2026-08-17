.class LY7/Y;
.super Ljava/lang/Object;

# interfaces
.implements LM8/b$c;


# static fields
.field public static final a:LY7/Y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LY7/Y;

    .line 2
    .line 3
    invoke-direct {v0}, LY7/Y;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY7/Y;->a:LY7/Y;

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
.method public a(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    check-cast p1, LL7/e;

    .line 2
    .line 3
    invoke-static {p1}, LY7/a0;->j0(LL7/e;)Ljava/lang/Iterable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
