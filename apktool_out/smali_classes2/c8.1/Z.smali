.class Lc8/Z;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final g:Lc8/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc8/Z;

    .line 2
    .line 3
    invoke-direct {v0}, Lc8/Z;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc8/Z;->g:Lc8/Z;

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
    check-cast p1, LL7/b;

    .line 2
    .line 3
    invoke-static {p1}, Lc8/e0;->a(LL7/b;)LC8/S;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
