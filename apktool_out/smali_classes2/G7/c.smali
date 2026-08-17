.class LG7/c;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:Ljava/lang/Class;

.field private final h:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG7/c;->g:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, LG7/c;->h:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LG7/c;->g:Ljava/lang/Class;

    .line 2
    .line 3
    iget-object v1, p0, LG7/c;->h:Ljava/util/Map;

    .line 4
    .line 5
    invoke-static {v0, v1}, LG7/f;->d(Ljava/lang/Class;Ljava/util/Map;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
